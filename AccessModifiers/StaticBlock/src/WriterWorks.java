public class WriterWorks {
    public  static  Writer[] writers;
    static {
        writers = new Writer[5];
        writers[0] = new Writer("Reşat Nuri", "Güntekin");
        writers[1] = new Writer("Necip Fazıl", "Kısakürek");
        writers[2] = new Writer("Yakup Kadri", "Karaosmanoğlu");
        writers[3] = new Writer("Halit Ziya", "Uşaklıgil");
        writers[4] = new Writer("Yahya Kemal", "Beyatlı");
    }

    public  static  Writer[] getWriters(){
        return  WriterWorks.writers;
    }
}
