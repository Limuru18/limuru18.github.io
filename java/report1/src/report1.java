class Book {
    private String isbn; //ISBN编号
    private String title;  //书名
    private String author; //作者
    private String publisher; //出版社
    private float price;  //价格
    private int amount; //库存,默认0
    private float discount=1; //折扣，默认为1

    public Book(String isbn, String title, String author, String publisher, float price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
    public Book() {}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    public int sellOut(int quantity){  //卖书方法
        int result=quantity;
        if(quantity > amount){ //如果库存不够，直接result=库存，将库存置为0
            result=getAmount();
            setAmount(0);
        }
        else {
            setAmount(getAmount()-quantity);
        }
        return result;
    }
    public void purchaseQuantity(int quantity){
        setAmount(getAmount()+quantity); //直接加到库存内
    }
    public float discountedPrice(float discount){
        return getPrice()*discount; //直接返回
    }

    @Override
    public String toString() {
        return "ISBN："+ getIsbn()+"\n"
                +"书名："+getTitle()+"\n"
                +"作者："+getAuthor()+"\n"
                +"出版社："+getPublisher()+"\n"
                +"价格："+getPrice()+"\n"
                +"库存："+getAmount();
    }
}
