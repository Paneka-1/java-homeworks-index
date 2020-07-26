public class Main2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate((float) 1.55, 80);

        System.out.println(index);
    }
}