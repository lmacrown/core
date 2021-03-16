package hello.core.sigletone;

public class SingleTonService {
    //객체 한개만 생성
    private static  final SingleTonService instance = new SingleTonService();

    public static SingleTonService getInstance(){
        return instance;
    }
    private SingleTonService(){

    }
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
    public static void main(String[] args){
        SingleTonService singleTonService1 =new SingleTonService();

    }
}
