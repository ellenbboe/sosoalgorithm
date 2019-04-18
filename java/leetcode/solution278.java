public class solution278 extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int h = n;
        while(l<h)
        {
            int m = l +(h-l)/2;
            if(isBadVersion(m))
            {
                h = m;
            }else{
                l = m+1;
            }
        }
        return l;
    }
}
