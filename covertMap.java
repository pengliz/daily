import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class covertMap {
    public static void main(String []args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L, "aaa"));
        userList.add(new User(2L, "bbb"));
        userList.add(new User(3L, "ccc"));
        userList.add(new User(2L, "ddd"));
        userList.add(new User(3L, "eee"));
        //1

        //Map<Long, String> map = userList.stream().collect(Collectors.toMap(User::getId,User::getUserName,(v1,v2) -> v2));
        Map<String,String> mp = new HashMap<>();
        mp.put("source","jupiter");
        mp.put("trackId","algor");

        String params = mp.entrySet().stream()
                .map(entry -> new StringBuilder(entry.getKey())
                        .append("=")
                        .append(entry.getValue()))
                .collect(Collectors.joining("&"));
        System.out.println(params);
    }
}
