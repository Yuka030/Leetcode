import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] list = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            list[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < prerequisites.length; i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            list[b].add(a);
            indegree[a] += 1;
        }

        Queue q = new LinkedList<Integer>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        //BFS
        while(!q.isEmpty()){
            int c = (int) q.poll();
            for(int i = 0; i < list[c].size(); i++){
                int j = (int) list[c].get(i);
                indegree[j] -= 1;
                if(indegree[j] == 0){
                    q.add(j);
                }
            }
        }

        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] != 0) return false;
        }

        return true;
    }
}
