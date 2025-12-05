package day2;
public class Mobile {
public void takePhoto() {
	System.out.println("take photo");
}
	public void makeCall(String number) {
		System.out.println(number);
	}
public static void main(String[] args) {
    Mobile obj=new Mobile();
    obj.takePhoto();
    obj.makeCall("6379533567");
    
	}

}
