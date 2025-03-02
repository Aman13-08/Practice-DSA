package dsa.arrays;
import java.util.*;
//Company Tags ->Google
//example ->nums1 = [[1, 5], [2, 3], [4, 7]] nums2 = [[1, 2], [3, 6], [4, 1]]
public class MergeTwo2DArraysBySummingValues {

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int i=0,j=0;
        List<int[]> result  = new ArrayList<>(); //vector<vector<int>>

        while(i<m && j<n){
            if(nums1[i][0] < nums2[j][0]){
                result.add(nums1[i]);//push_back()
                i++;
            }
            else if(nums2[j][0] < nums1[i][0]){
                result.add(nums2[j]);
                j++;
            }
            else{//nums1[i][0] == nums2[j][0])
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});//nums1[i][1] + nums2[j][1] = 5 + 2 = 7
                i++;
                j++;
            }
        }
//nums1 = [[1, 2], [3, 4], [5, 6]] nums2 = [[1, 1], [2, 2]]
        while(i<m){
            result.add(nums1[i]);
            i++;
        }
//nums1 = [[1, 2], [3, 4]] //nums2 = [[1, 1], [2, 2], [5, 5]]
        while(j<n){
            result.add(nums2[j]);
            j++;
        }

        return result.toArray(new int[0][]);// new int[0][] creates a 2D array (an array of arrays) with 0 rows.
    }
    public static void main(String[] args) {
    int [][] nums1 = {{1,2},{2,3},{4,5}};
    int [][] nums2 = {{1,4} , {3,2} , {4,1}};
        System.out.println(Arrays.deepToString(mergeArrays(nums1, nums2)));
    }
}
