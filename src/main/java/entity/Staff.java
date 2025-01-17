package entity;


import org.springframework.stereotype.Component;


@Component
public class Staff implements SellingInterface{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    @Override
    public void sell() throws InterruptedException {
        System.out.println(name + " продаёт товар.");
        Thread.sleep(1000);

    }
}
