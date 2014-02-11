package entity;

public class GeneralInfo {
		private int photoid;
		private String name;
	public int getPhotoid(){
		return photoid;
	}
	public void setPhotoid(int photoid){
		this.photoid=photoid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public GeneralInfo() {

	}
	public GeneralInfo(int photoid, String name) {
		super();
		this.photoid = photoid;
		this.name = name;
	}
	
}
