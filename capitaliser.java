public class Program
{
    public static String cap_first(String s) {
        /*��������� ������ �� ��������� �� ������, ����� ���� �������� �� ������ ���������. � ���������� ������������ ��������� ��������� ����� �����������, ������������ ������� � ����� � ��������. ���������� ��������� ��� ���������� �������.*/
        String res = "";
        String[] arr = s.split("\\.");
        for(int i = 0; i < arr.length; i++) {
        
            StringBuffer other = new StringBuffer(arr[i].substring(0, arr[i].length() - 1).toLowerCase()).reverse();
            if (i > 0) {
                other.delete(other.length() - 1, other.length()); //������� ������ � �����
            }
            res += Character.toString(arr[i].charAt(arr[i].length() - 1)).toUpperCase() + other + ". ";
            
        }
        
        return res;
    }
    public static String capitalize(String s){
    /*���������� ������������� ��������� ������ ������� ������. ����� ���� � ������ ������� �������� �� ��������� ���������. ���� ������ ����� ����� �������, � ���������� ������������ ��������� �����, ����� - �������� ��� ��� ������.  */
    String res = Character.toString(s.charAt(0)).toUpperCase();
    for(int i = 1; i < s.length(); i++) {
        if (res.charAt(res.length() - 1) == ' ') {
            res += Character.toString(s.charAt(i)).toUpperCase();
        } else {
            res += Character.toString(s.charAt(i)).toLowerCase();
        }
    }
    return res;
    }
    public static void main(String[] args) {
        System.out.println(capitalize("iVanOv IVan iVANoViCh."));
        System.out.println(cap_first("mAmA MuLa RamU. MaSHa iGrAla V MYaCH."));
    }
}