package class10;
import java.util.*;
public class spiral1 {
	public List<Integer> spiral(int[][] matrix) {
	    int N = matrix.length;
	    List<Integer> list = new ArrayList<Integer>();
	    if (N == 0) {return list;}
	    // 3 - 0 - 1 = 2  j = 0,1 < side = 2
	    Recursion(list, matrix, 0, N-1); // N = 3
	    return list;
	  }
	  private void Recursion(List<Integer> list, int[][] matrix, int layer, int side) {
		System.out.println("layer = "+ layer +" sidelen = "+ side);
		if (side == 0) { list.add(matrix[layer][layer]); return;}
	    if (layer == (matrix.length+1)/2 ) {
	      return;
	    }
	    int n = 0;
	    while(n < side)  {
	      list.add(matrix[layer][n+layer]);
	      n++;
	    }
	    System.out.println(list);
	    int m = 0;
	    while(m < side)  {
	      list.add(matrix[layer+m][n+layer]);
	      m++;
	    }
	    System.out.println(list);
	    while(n > 0) {
	      list.add(matrix[layer+m][layer+n]);
	      n--;
	    }
	    while (m > 0) {
	      list.add(matrix[layer+m][layer+n]);
	      m--;
	    }
	    Recursion (list, matrix, layer+1, side - 2);
	  }
	  public static void main (String[] args) {
		  spiral1 s = new spiral1();
		  int[][] m = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		  List<Integer> l = s.spiral(m);
		  System.out.println(l);
	  }
}
