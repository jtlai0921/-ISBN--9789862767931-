package book.java7.chapter4;
import static java.lang.System.*;
class MemberIDException extends Exception{
    public MemberIDException(String mID) {
        super("會員證號 " + mID + " 驗證失敗 !");
    }
    public void contactWith() {  // 自定例外類別之自定方法
        System.out.println("請連絡服務人員 : " +
                               "Tel (xx)-(xxxx-xxxx) !");
    }
}
public class ErrorHandling4 {
    public static void main(String[] args) {
        boolean verify = true;
        try {
            checkMemberID("1234567890");
        }
        catch(MemberIDException e) {
            out.println("錯誤訊息 : " + e.getMessage());
            e.contactWith(); // 自定例外類別之自定方法
            verify = false;
        }
        if(verify)
            out.println("會員證號驗證成功 !");
        else
            out.println("會員證號驗證失敗 !");
    }
    public static void checkMemberID(String mID) 
                                     throws MemberIDException{
        if (mID.length() != 5) { // 號碼長度必須 = 5
            throw new MemberIDException(mID);
        }
    }
}
