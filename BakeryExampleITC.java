
import java.lang.Thread;

class Bakery {
    int goodsAvailable;
    final int MAX_GOODS_PER_DAY = 100;
    int goodsProducedToday;

    public synchronized void bakeGoods() {
    	if(goodsProducedToday<MAX_GOODS_PER_DAY) {
        if (goodsAvailable > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }

        } else  {
            System.out.println(goodsAvailable + " goods avalaible ");
            goodsAvailable = goodsAvailable + 10;
            goodsProducedToday += 10;
            notifyAll();
        }
    }
    }

    public synchronized void buyGoods(String cusnm) {
        if (goodsAvailable == 0) {
            System.out.println("waiting for baked");
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        else
        {
        goodsAvailable -= 10;
        if (goodsAvailable == 0) {
            notify();
        }
    }
    }
}

class Baker implements Runnable {
    Bakery baker;

    Baker(Bakery b) {
        this.baker = b;
    }

    public void run() {
        while (!isProductionFinished()) {
            baker.bakeGoods();
        }
    }

    public boolean isProductionFinished() {
        if (baker.goodsProducedToday == baker.MAX_GOODS_PER_DAY && baker.goodsAvailable == 0)
        	
            return true;
        
        else
            return false;
    }
}

class Customer implements Runnable {
    Bakery bakery;
    String customerName;

    Customer(Bakery b, String cn) {
        this.bakery = b;
        this.customerName = cn;
    }

    @Override
    public void run() {
        if (bakery.goodsAvailable == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        else{
        bakery.buyGoods(customerName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
    
    }
}
}

public class BakeryExampleITC {
public static void main(String[] args) {

    Bakery bakery = new Bakery();
        Baker baker = new Baker(bakery);
        Thread bakerThread = new Thread(baker);
        bakerThread.start();
        for (int i = 1; i <= 11; i++) {
            Customer customer = new Customer(bakery, "Customer" + i);
            Thread customerThread = new Thread(customer);
            customerThread.start();
        }

        

}
       

}