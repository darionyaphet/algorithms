package org.darion.yaphet.lintcode;

public class FirstBadVersion {
    public int findFirstBadVersion(int n) {
//        int low = 1;
//        int high = n;
//        int middle = (low + high) / 2;
//        while (low < high) {
//            if (SVNRepo.isBadVersion(middle)) {
//                high = middle;
//            } else {
//                low = middle + 1;
//            }
//            middle = (low + high) / 2;
//        }
//        return low;

        int start = 1, end = n;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (SVNRepo.isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (SVNRepo.isBadVersion(start)) {
            return start;
        }
        return end;
    }

    public static void main(String[] args) {
        FirstBadVersion instance = new FirstBadVersion();
        System.out.println(instance.findFirstBadVersion(1));
    }
}
