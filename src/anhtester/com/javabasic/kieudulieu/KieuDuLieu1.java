package anhtester.com.javabasic.kieudulieu;

public class KieuDuLieu1 {

    static {
        //Block
        //Auto run
        //Load file properties

    }

    double numberInt = 300000.8124568205;

    boolean checkValue = true;

    static String doanVan = "- Cách hiểu thứ nhất (đoạn ý): Đoạn văn được dùng với ý nghĩa để chỉ sự phân đoạn nội dung, phân đoạn ý của văn bản. Một văn bản bao gồm nhiều đoạn văn: Đoạn mở đầu văn bản, những đoạn khai triển văn bản, đoạn kết thúc văn bản. Mỗi đoạn phải có sự hoàn chỉnh nhất định nào đó về mặt ý, về mặt nội dung. Nhưng thế nào là một nội dung, một ý hoàn chỉnh thì không có tiêu chí để xác định rõ ràng. Một văn bản, tuỳ theo người đọc cảm nhận mà phân chia ra thành các đoạn, sự phân chia có thể không thống nhất giữa những người đọc: có người chia theo ý lớn, có người chia theo ý nhỏ. Ý lớn là đoạn bài có hai hoặc ba ý nhỏ được khai triển từ ý lớn, bao gồm hai hoặc ba đoạn văn ngắn, mỗi đoạn ngắn đó là một ý nhỏ, các đoạn này hợp ý với nhau thành một ý lớn; ý nhỏ là ý được khai triển từ ý lớn, về mặt nội dung chỉ triển khai theo một phương diện, một hướng cụ thể, mỗi ý nhỏ là một đoạn.\n" +
            "\n" +
            "Cách hiểu này khiến cho cách phân đoạn thiếu tính khách quan. Với cách hiểu này, diện mạo đoạn văn không được xác định (đoạn văn bắt đầu từ đâu, như thế nào, các câu văn trong đoạn có mối liên kết với nhau như thế nào,…) cho nên việc xây dựng đoạn văn trở nên khó khăn, phức tạp, khó rèn luyện các thao tác để trở thành kĩ năng kĩ xảo.\n" +
            "\n" +
            "- Cách hiểu thứ hai (đoạn lời): Đoạn văn được hiểu là sự phân chia văn bản thành những phần nhỏ, hoàn toàn dựa vào dấu hiệu hình thức: một đoạn văn bao gồm những câu văn nằm giữa hai dấu chấm xuống dòng.\n" +
            "\n" +
            "Cách hiểu này không tính tới tiêu chí nội dung, cơ sở ngữ nghĩa của đoạn văn. Với cách hiểu này, việc rèn luyện xây dựng đoạn văn càng trở nên mơ hồ, khó xác định vì đoạn văn không được xây dựng trên một cơ sở chung nào vì hình thức bao giờ cũng phải đi đôi với nội dung, bao chứa một nội dung nhất định và phù hợp với nội dung mà nó bao chứa.\n" +
            "\n";

    public void getInfo(){

    }

    public static void main(String[] args) {
        //System.out.println(KieuDuLieu1.numberInt);

//        String abc = "Selenium";
//        System.out.println(abc);

        System.out.println(doanVan);

        KieuDuLieu1 kieuDuLieu1 = new KieuDuLieu1();
        System.out.println(kieuDuLieu1.numberInt);

        System.out.println(Bank.BANKNAME);
        System.out.println(Bank.VAT);
        System.out.println(Bank.INTEREST_RATE);
    }

}
