package assign1Session9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HDTVDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HDTV> hdtvlist = new ArrayList<>();
		hdtvlist.add(new HDTV(52, "Samsung"));
		hdtvlist.add(new HDTV(32, "LG"));		
		hdtvlist.add(new HDTV(42, "Sansui"));
		
		Collections.sort(hdtvlist,new Comparator<HDTV>() {

			@Override
			public int compare(HDTV obj1, HDTV obj2) {
				// TODO Auto-generated method stub
				return obj1.getSize()-obj2.getSize();
			}
		});
		
		printresult(hdtvlist);

	}
	
	public static void printresult(List<HDTV> lst)
	{
		//2nd Way
		for(HDTV tv:lst)
		{
			System.out.println(tv.toString());
		}
	}

}
