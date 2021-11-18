package chapter2_1;

public class Book {
	String isbn;
	String name;
	String price;
	public booblean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj==null){
			return false;
			
		}
		if(getClass()!=obj.getClass()){
			
		}
		Book other = (Book)obj;
		if(isbn==null){
			if(other.isbn!=null){
				return false;
			}
			
		}else if(!isbn.equals(other.isbn))
			return false;
		if(name==null){
			if(other.name!=null){
				return false;
			}
			
		}else if(!name.equals(other.name))
			return false;
		if(Double.doubleToLongBits(price)
				!=Double.doubleToLongBits(other.price))
			return false;
		return true;
		
		
		
		
		
	}
	

}
