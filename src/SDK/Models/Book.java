package SDK.Models;

/**
 * Created by biancajuul-hansen on 21/11/2016.
 */
public class Book {

        private int BookID;
        private String Title;
        private int Version;
        private double ISBN;
        private double PriceAB;
        private double PriceSAXO;
        private double PriceCDON;
        private String Publisher;
        private String Author;

        public Book(int bookID, String title, int version, double ISBN, double priceAB, double priceSAXO, double priceCDON, String publisher, String author) {
            BookID = bookID;
            Title = title;
            Version = version;
            this.ISBN = ISBN;
            PriceAB = priceAB;
            PriceSAXO = priceSAXO;
            PriceCDON = priceCDON;
            Publisher = publisher;
            Author = author;
        }

        public int getBookID() {
            return BookID;
        }

        public void setBookID(int bookID) {
            BookID = bookID;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public int getVersion() {
            return Version;
        }

        public void setVersion(int version) {
            Version = version;
        }

        public double getISBN() {
            return ISBN;
        }

        public void setISBN(double ISBN) {
            this.ISBN = ISBN;
        }

        public double getPriceAB() {
            return PriceAB;
        }

        public void setPriceAB(double priceAB) {
            PriceAB = priceAB;
        }

        public double getPriceSAXO() {
            return PriceSAXO;
        }

        public void setPriceSAXO(double priceSAXO) {
            PriceSAXO = priceSAXO;
        }

        public double getPriceCDON() {
            return PriceCDON;
        }

        public void setPriceCDON(double priceCDON) {
            PriceCDON = priceCDON;
        }

        public String getPublisher() {
            return Publisher;
        }

        public void setPublisher(String publisher) {
            Publisher = publisher;
        }

        public String getAuthor() {
            return Author;
        }

        public void setAuthor(String author) {
            Author = author;
        }
    }


