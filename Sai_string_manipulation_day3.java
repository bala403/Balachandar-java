class Sai 
{
    public static void main(String args[]) 
    {
        String s1 = "I Love java";
        String s2 = "java";
        String s3 = "JAVA";
        String t1 = s1.toLowerCase();
        System.out.println(t1);
        String t2 = s1.toUpperCase();
        System.out.println(t2);
        String t3 = s1.replace('o', 'i');
        System.out.println(t3);
        String t4 = s1.substring(2, 11);
        System.out.println(t4);
        String t5 = s1.substring(2, 6);
        System.out.println(t5);
        String t6 = String.valueOf(s1.indexOf('L'));
        System.out.println(t6);
        String t7 = String.valueOf(s1.length());
        System.out.println(t7);
        if (s2.equals(s3)) 
        {
            System.out.println("True");
        }
        if (s2.equalsIgnoreCase(s3)) 
        {
            System.out.println("True");
        }
        char t9 = s1.charAt(5);
        System.out.println(t9);
        int comparisonResult = s1.compareTo(s2);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}