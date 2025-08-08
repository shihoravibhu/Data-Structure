// 223. Rectangle Area

public class m25_computeArea {
     public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int area1 = Math.abs((ax1 - ax2) * (ay1 - ay2));      // for a
        int area2 = Math.abs((bx1 - bx2) * (by1 - by2));      // for b

        int cx1 = Math.max(ax1,bx1);
        int cy1 = Math.max(ay1,by1);
        int cx2 = Math.min(ax2,bx2);
        int cy2 = Math.min(ay2,by2);

        int cl = (cx2 - cx1);    // width (x)
        int ch = (cy2 - cy1);    //height (y)

        int overlap = 0;

        if(cl > 0 && ch > 0){
            overlap = cl * ch; 
        }

        return area1 + area2 - overlap;
    }
    public static void main(String[] args) {
        
    }
}
