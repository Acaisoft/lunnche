export class Order {
    public personName: string;
    public pubName: string;
    public dishName: string;
    public dishPrice: number;

    constructor(personName, pubName, dishName, dishPrice) {
        this.personName = personName;
        this.pubName = pubName;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }
}
