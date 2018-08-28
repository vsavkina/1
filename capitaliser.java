public class Program
{
    public static String cap_first(String s) {
        /*Разбивает строку на подстроки по точкам, затем цикл проходит по каждой подстроке. К результату прибавляются заглавная последняя буква предложения, перевернутый остаток и точка с пробелом. Возвращает результат без последнего пробела. */        String res = "";
        String[] arr = s.split("\\.");
        for(int i = 0; i < arr.length; i++) {
        
            StringBuffer other = new StringBuffer(arr[i].substring(0, arr[i].length() - 1).toLowerCase()).reverse();
            if (i > 0) {
                other.delete(other.length() - 1, other.length()); //óáèðàåì ïðîáåë â êîåöå
            }
            res += Character.toString(arr[i].charAt(arr[i].length() - 1)).toUpperCase() + other + ". ";
            
        }
        
        return res;
    }
    public static String capitalize(String s){
    /*Результату присваивается заглавный первый элемент строки. Затем цикл в прямом порядке проходит по остальным элементам. Если символ стоит после пробела, к результату прибавляется заглавная буква, иначе - строчная или сам символ.  */    String res = Character.toString(s.charAt(0)).toUpperCase();
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
