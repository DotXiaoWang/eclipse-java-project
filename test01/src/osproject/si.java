package osproject;

import java.util.*;
public class si
{
    //ҳ���С,ÿ��ҳ��ɰ���instructionsNumPerPage��ָ��
    public static int instructionsNumPerPage;

    //��Ÿó�������ִ�е�ָ��������ַ����
    public static int[] instructionsSequence = null;

    //��Ž�����ָ���ַ����ת����(�����ϲ�����ҳ��)������ҳ������
    public static int[] pagesSequence = null;

    //ָ��������ó�����ڴ����
    public static int memoryBlocksNum;


    public static void main(String[] args)
    {

        int count = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t**********��ӭʹ��ҳ���û�ģ��ϵͳ��**********\n");

        while (true)
        {
            System.out.println("*****�� " + count + " �������ҳ���û�ģ�����*****\n");
            System.out.println("��������������ָ����������ֻ֧��5�ı���, �˳�ϵͳ������-1)");

            int inputValue = scan.nextInt();

            if(inputValue == -1) break;

            int instructionsNum = inputValue;

            instructionsSequence = generateInstructionsSequence(instructionsNum);
            System.out.println("ϵͳ������ɵ�ָ���ַ�������£�");
            showInstructionsSequence(instructionsSequence);
            System.out.println();

            System.out.println("������ҳ���С��1,2,4,8,16 �ֱ��ʾ 1k,2k,4k,8k,16k����");

            //ÿ1k���10��ָ��
            instructionsNumPerPage = scan.nextInt() * 10;
            pagesSequence = convertToPagesSequence(instructionsSequence, instructionsNumPerPage);
            System.out.println("��ָ���ַ���ж�Ӧ��ҳ�����У��Ѿ�������ҳ�źϲ������£�");
            showPagesSequence(pagesSequence);
            System.out.println();
            System.out.println("ʵ���ܹ�ʹ�õ���ҳ�Ÿ���Ϊ��" + pagesSequence.length);
            System.out.println();

            System.out.println("�����������ó�����ڴ����:��1~" + pagesSequence.length + ")");
            memoryBlocksNum = scan.nextInt();

            while(true)
            {
                System.out.println("��������Ҫģ���ҳ���û��㷨��ţ���1��FIFO�� 2��LRU�� 3��OPT, �˳��ó����ҳ���û�ģ�����������-1)");
                int flag = scan.nextInt();

                if(flag == -1) break;

                switch (flag)
                {
                    case 1:
                        FIFO(pagesSequence, memoryBlocksNum);
                        break;
                    case 2:
                        LRU(pagesSequence, memoryBlocksNum);
                        break;
                    case 3:
                        OPT(pagesSequence, memoryBlocksNum);
                        break;
                    default:
                        System.out.println("������������");
                }

                System.out.println();
            }

            System.out.println("\n\n");

            count++;
        }

        System.out.println("\n~~~~~~~~~~���ѳɹ��˳�ϵͳ��~~~~~~~~~~");

    }

    //instructionsNumΪ5�ı���
    public static int[] generateInstructionsSequence(int instructionsNum)
    {
        int[] instructionsSequence = new int[instructionsNum];

        int count = 0;

        while (count < instructionsNum)
        {
            int randomAddress1 = 0 + (int) (Math.random() * (((instructionsNum - 1) - 0) + 1));
            instructionsSequence[count] = randomAddress1;
            randomAddress1++;
            instructionsSequence[++count] = randomAddress1;

            int randomAddress2 = 0 + (int) (Math.random() * ((randomAddress1 - 0) + 1));
            instructionsSequence[++count] = randomAddress2;
            randomAddress2++;
            instructionsSequence[++count] = randomAddress2;

            int randomAddress3 = (randomAddress2 + 1) + (int) (Math.random() * (((instructionsNum - 1) - (randomAddress2 + 1)) + 1));
            instructionsSequence[++count] = randomAddress3;

            count++;
        }

        return instructionsSequence;
    }

    public static void showInstructionsSequence(int[] instructionsSequence)
    {
        for (int i = 0; i < instructionsSequence.length; i++)
        {
            System.out.printf("%5s", instructionsSequence[i]);

            if ((i + 1) % 20 == 0)
            {
                System.out.println();
            }
        }

        System.out.println();
    }


    public static int[] convertToPagesSequence(int[] instructionsSequence, int instructionsNumPerPage)
    {
        ArrayList<Integer> pagesList = new ArrayList<Integer>();

        int temp = -1;
        //ҳ��
        int pageIndex;

        for (int i = 0; i < instructionsSequence.length; i++)
        {
            pageIndex = instructionsSequence[i] / instructionsNumPerPage;

            //�����ڵ�ҳ�źϲ�
            if (pageIndex != temp)
            {
                pagesList.add(pageIndex);
                temp = pageIndex;
            }
        }

        //����ҳ�����о��ϲ�֮�󳤶��������ָ��������ַ���г���
        int[] pagesSequence = new int[pagesList.size()];

        for (int i = 0; i < pagesList.size(); i++)
        {
            pagesSequence[i] = pagesList.get(i);
        }

        return pagesSequence;
    }


    public static void showPagesSequence(int[] pagesSequence)
    {
        for (int i = 0; i < pagesSequence.length; i++)
        {
            System.out.printf("%5s", pagesSequence[i]);

            if ((i + 1) % 20 == 0)
            {
                System.out.println();
            }
        }

        System.out.println();
    }


    public static void FIFO(int[] pagesSequence, int memoryBlocksNum)
    {
        //ִ��ҳ�������ڼ��ڴ���״̬
        int[][] memoryBlocksState = new int[pagesSequence.length][memoryBlocksNum];

        //��ָ��ָ��Ҫ���û����ڴ���λ�ã��±�λ�ã�
        int curPosition = 0;

        //ִ��ÿ��ҳ��ʱ�ڴ�����е�״̬
        int[] tempState = new int[memoryBlocksNum];

        //��¼ȱҳ����� 1��ʾȱҳ��0��ʾ��ȱҳ
        int[] isLackOfPage = new int[pagesSequence.length];
        Arrays.fill(isLackOfPage, 0, pagesSequence.length, 0);

        //ȱҳ����
        int lackTimes = 0;

        //��ʼʱ���ڴ��״̬��Ϊ���У�-1��ʾ��
        Arrays.fill(tempState, 0, memoryBlocksNum, -1);

        for (int i = 0; i < pagesSequence.length; i++)
        {
            //���ȱҳ
            if (findKey(tempState, 0, memoryBlocksNum - 1, pagesSequence[i]) == -1)
            {
                isLackOfPage[i] = 1;
                lackTimes++;
                tempState[curPosition] = pagesSequence[i];

                //ָ�������ƶ�����memoryBlocksNumʱ��������ָ��ʼ���ڴ��λ��0
                if (curPosition + 1 > memoryBlocksNum - 1)
                {
                    curPosition = 0;
                }
                else
                {
                    curPosition++;
                }
            }

            //���浱ǰ�ڴ�����е�״̬
            System.arraycopy(tempState, 0, memoryBlocksState[i], 0, memoryBlocksNum);

        }

        showMemoryBlocksState(memoryBlocksState, pagesSequence, memoryBlocksNum, isLackOfPage, lackTimes);
    }

    public static void LRU(int[] pagesSequence, int memoryBlocksNum)
    {
        //ά��һ�����ʹ�õ��ڴ�鼯��
        LRULinkedHashMap<String, Integer> recentVisitedBlocks = new LRULinkedHashMap<String, Integer>(memoryBlocksNum);

        //ִ��ҳ�������ڼ��ڴ���״̬
        int[][] memoryBlocksState = new int[pagesSequence.length][memoryBlocksNum];

        //��ָ��ָ��Ҫ���û����ڴ���λ�ã��±�λ�ã�
        int curPosition = 0;

        //ִ��ÿ��ҳ��ʱ�ڴ�����е�״̬
        int[] tempState = new int[memoryBlocksNum];

        //��¼ȱҳ����� 1��ʾȱҳ��0��ʾ��ȱҳ
        int[] isLackOfPage = new int[pagesSequence.length];
        Arrays.fill(isLackOfPage, 0, pagesSequence.length, 0);

        //ȱҳ����
        int lackTimes = 0;

        //��ʼʱ���ڴ��״̬��Ϊ���У�-1��ʾ��
        Arrays.fill(tempState, 0, memoryBlocksNum, -1);

        for (int i = 0; i < pagesSequence.length; i++)
        {
            //���ȱҳ
            if(findKey(tempState, 0, memoryBlocksNum - 1, pagesSequence[i]) == -1)
            {
                isLackOfPage[i] = 1;
                lackTimes++;

                //����ڴ�黹��ʣ��
                if(tempState[memoryBlocksNum - 1] == -1)
                {
                    tempState[curPosition] = pagesSequence[i];
                    recentVisitedBlocks.put(String.valueOf(pagesSequence[i]), pagesSequence[i]);
                    curPosition++;
                }
                //����ڴ�鶼�ѱ�ʹ��
                else
                {
                    //�ҵ���ǰ�ڴ���������������ʹ�õ��ڴ�飬�������û�
                    curPosition = findKey(tempState, 0, memoryBlocksNum - 1, recentVisitedBlocks.getHead());
                    tempState[curPosition] = pagesSequence[i];
                    recentVisitedBlocks.put(String.valueOf(pagesSequence[i]), pagesSequence[i]);
                }
            }
            //�����ȱҳ
            else
            {
                //�����ﱻʹ�õ�pageSequence[i]�����ʹ�õ��ڴ�鼯���е�ԭ��λ�õ�������������ʵ�λ��
                recentVisitedBlocks.get(String.valueOf(pagesSequence[i]));
            }

            //���浱ǰ�ڴ�����е�״̬
            System.arraycopy(tempState, 0, memoryBlocksState[i], 0, memoryBlocksNum);
        }

        showMemoryBlocksState(memoryBlocksState, pagesSequence, memoryBlocksNum, isLackOfPage, lackTimes);
    }

    public static void OPT(int[] pagesSequence, int memoryBlocksNum)
    {
        //ִ��ҳ�������ڼ��ڴ���״̬
        int[][] memoryBlocksState = new int[pagesSequence.length][memoryBlocksNum];

        //��ָ��ָ��Ҫ���û����ڴ���λ�ã��±�λ�ã�
        int curPosition = 0;

        //ִ��ÿ��ҳ��ʱ�ڴ�����е�״̬
        int[] tempState = new int[memoryBlocksNum];

        //��¼ȱҳ����� 1��ʾȱҳ��0��ʾ��ȱҳ
        int[] isLackOfPage = new int[pagesSequence.length];
        Arrays.fill(isLackOfPage, 0, pagesSequence.length, 0);

        //ȱҳ����
        int lackTimes = 0;

        //��ʼʱ���ڴ��״̬��Ϊ���У�-1��ʾ��
        Arrays.fill(tempState, 0, memoryBlocksNum, -1);

        for (int i = 0; i < pagesSequence.length; i++)
        {
            //���ȱҳ
            if(findKey(tempState, 0, memoryBlocksNum - 1, pagesSequence[i]) == -1)
            {
                isLackOfPage[i] = 1;
                lackTimes++;

                //����ڴ�黹��ʣ��
                if(tempState[memoryBlocksNum - 1] == -1)
                {
                    tempState[curPosition] = pagesSequence[i];
                    curPosition++;
                }
                //����ڴ�鶼�ѱ�ʹ��
                else
                {
                    int maxLoc = 0;

                    for(int j = 0; j < memoryBlocksNum; j++)
                    {
                        //�ҳ���ǰ�ڴ�������е��ڴ��tempState[j]�ڽ����ᱻ���ʵ��ģ���һ����λ��
                        int loc = findKey(pagesSequence, i + 1, pagesSequence.length - 1, tempState[j]);

                        //����������ڴ�鶼���ٱ�ʹ����
                        if (loc == -1)
                        {
                            curPosition = j;
                            break;
                        }
                        //�ҳ���ǰ�ڴ�������е������ڴ���ڽ����ᱻ���ʵ�����Զλ�ã���ΪmaxLoc
                        else
                        {
                            if(maxLoc < loc)
                            {
                                maxLoc = loc;
                                curPosition = j;
                            }
                        }
                    }

                    tempState[curPosition] = pagesSequence[i];
                }
            }

            //���浱ǰ�ڴ�����е�״̬
            System.arraycopy(tempState, 0, memoryBlocksState[i], 0, memoryBlocksNum);
        }

        showMemoryBlocksState(memoryBlocksState, pagesSequence, memoryBlocksNum, isLackOfPage, lackTimes);

    }


    //����key��arr�е�һ�γ��ֵ�λ��,start��endΪ�����±�, �Ҳ����򷵻�-1
    public static int findKey(int[] arr, int start, int end, int key)
    {
        for (int i = start; i <= end; i++)
        {
            if (arr[i] == key)
            {
                return i;
            }
        }

        return -1;
    }


    public static void showMemoryBlocksState(int[][] memoryBlocksState, int[] pagesSequence, int memoryBlocksNum, int[] isLackofPage, int lackTimes)
    {
        String[] pagesDescription = {"��ȱҳ", "ȱҳ"};

        int pagesSequenceLength = pagesSequence.length;

        for (int i = 0; i < pagesSequenceLength; i++)
        {
            System.out.println("��ǰ����ҳ�ţ�" + pagesSequence[i]);
            System.out.print("\t");

            for (int j = 0; j < memoryBlocksNum * 6 + 1; j++)
            {
                System.out.print("-");
            }

            System.out.print("\n\t");

            for (int k = 0; k < memoryBlocksNum; k++)
            {
                if (k == 0)
                {
                    System.out.print("|");
                }
                //�����ǰ�ڴ�黹û��ʹ�ã���Ϊ��
                if (memoryBlocksState[i][k] == -1)
                {
                    System.out.printf("%5s|", " ");
                }
                else
                {
                    System.out.printf("%5s|", memoryBlocksState[i][k]);
                }
            }

            System.out.print("  ȱҳ�����" + pagesDescription[isLackofPage[i]]);

            System.out.print("\n\t");

            for (int j = 0; j < memoryBlocksNum * 6 + 1; j++)
            {
                System.out.print("-");
            }

            System.out.println();
        }

        //ȱҳ��
        double lackOfPagesRate = lackTimes * 1.0 / pagesSequence.length;

        System.out.println("\n�ó����ҳ�����г���Ϊ��" + pagesSequence.length + ", ִ�и��㷨��ȱҳ����Ϊ��" + lackTimes + ", ȱҳ��Ϊ��" + lackOfPagesRate * 100 + "%");
    }

}


//LRU�㷨�ĸ����洢��
class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V>
{
    //����ڴ������������
    private int maxMemoryBlocksNum;

    //����Ĭ�ϸ�������
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public LRULinkedHashMap(int maxCapacity)
    {
        //����accessOrderΪtrue����֤��LinkedHashMap�ײ�ʵ�ֵ�˫�������ǰ��շ��ʵ��Ⱥ�˳������
        super(maxCapacity, DEFAULT_LOAD_FACTOR, true);
        this.maxMemoryBlocksNum = maxCapacity;
    }

    //�õ�������ٱ����ʵ�Ԫ��
    public V getHead()
    {
        return (V) this.values().toArray()[0];
    }

    //�Ƴ������������ٱ����ʵ�Ԫ��
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
    {
        return size() > maxMemoryBlocksNum;
    }
}