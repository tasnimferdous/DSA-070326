package Interview;

//Programming languages are playing football. Three teams, Java, Python, and C#. All play all.
// Home and Away matches are provided in a list, where the home team is listed first.
// Results of the matches are encoded in a list, where 0 means the home team lost, and 1 means the home team won.
// The winning team gets 3 points.
//
//        matches = [["java", "python"], ["python", "C#"], ["C#", "java"]]
//results = [0,1,1]
//
//def declare_winner(matchlist, resultlist):
//thewinner = None
//
//  return thewinner
//
//matches = [["java", "python"], ["python", "C#"], ["C#", "java"]]
//results = [0,1,1]
//print(declare_winner(matchlist, resultlist))


import java.util.*;

public class Winner {
    public static void main(String[] args) {
        List<List<String>> matches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of matches: ");
        int n = sc.nextInt();
        int[] results = new int[n];

        for (int i = 0; i < n; i++){
            List<String> match = new ArrayList<>();
            System.out.println("Enter the home team: ");
            match.add(sc.next());
            System.out.println("Enter the away team: ");
            match.add(sc.next());
            matches.add(match);
            System.out.println("Enter the result (0 for home team lost, 1 for home team won): ");
            results[i] = sc.nextInt();
        }

        String winner = declare_winner(matches, results);
        System.out.println("The winner is: " + winner);

    }

    static String declare_winner(List<List<String>> matches, int[] results) {
        Map<String, Integer> note = new HashMap<>();
        for(int i = 0; i < matches.size(); i++){
            if(results[i] == 1){
                note.put(matches.get(i).getFirst(), note.get(matches.get(i).getFirst()) == null ? 3: note.get(matches.get(i).getFirst()) + 3);
            }else {
                note.put(matches.get(i).getLast(),  note.get(matches.get(i).getLast()) == null ? 3: note.get(matches.get(i).getLast()) + 3);
            }
        }

        return note.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}
