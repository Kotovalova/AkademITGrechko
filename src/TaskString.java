public class TaskString {

    public static String createNumberString(int from, int to) {
        StringBuilder sb = new StringBuilder();
        for (int i = from; i <= to; i++) {
            sb.append(i).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public static String extractServerName(String url) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("URL не может быть пустым");
        }

        int protocolIndex = url.indexOf("://");
        if (protocolIndex == -1) {
            throw new IllegalArgumentException("Нет протокола ://");
        }

        String serverName = url.substring(protocolIndex + 3);
        if (serverName.contains("/")) {
            int j = serverName.indexOf("/");
            serverName = serverName.substring(0, j);
        }
        return serverName;
    }

    public static int sumNumbersFromString(String s){

        String[] smas = s.split(", ");
        int sum = 0;
        for (String num : smas) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    public static void main(String[] args) {
        String result = createNumberString(1, 100);
        System.out.println(result);

        String urlWeb = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        System.out.println(extractServerName(urlWeb));

        String urlWeb2 = "http://SomeServerName";
        System.out.println(extractServerName(urlWeb2));

        String urlWeb3 = "";
        System.out.println(extractServerName(urlWeb3));

        String stringOfNumbers = "1, 2, 3, 4, 5";
        System.out.println(sumNumbersFromString(stringOfNumbers));
    }
}
