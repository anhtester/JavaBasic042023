package anhtester.com.javabasic.phuongthuc;

public class LearnMethod {

    //Hàm không trả về
    public static void convertDateTime() {
        String dateTime = "2023-04-19";
        System.out.println("Date Time: " + dateTime);

        int year = Integer.valueOf(dateTime.split("-", 0)[0]);
        int month = Integer.valueOf(dateTime.split("-", 0)[1]);
        int day = Integer.valueOf(dateTime.split("-", 0)[2]);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        //If Else giá trị tháng
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "Jan";
                break;
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "Mar";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "Jul";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sep";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
        }

        System.out.println("Month Name: " + monthName);

        String dateTimeConverted = day + " " + monthName + " " + year;

        System.out.println("Date Time Converted: " + dateTimeConverted);
    }

    public static void main(String[] args) {
        convertDateTime();
    }

}
