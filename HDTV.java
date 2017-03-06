package assign1Session9;

public class HDTV implements Comparable<HDTV> {
     int size;
     String brandname;
     
     public HDTV(int size,String brandname)
     {
    	 super();
    	 this.size =size;
    	 this.brandname= brandname;
     }
   
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Override
	public String toString()
	{
		return size+" "+brandname;
	}


	@Override
	public int compareTo(HDTV cm) {
		// TODO Auto-generated method stub
		return (getSize()-cm.getSize());
	}
}
