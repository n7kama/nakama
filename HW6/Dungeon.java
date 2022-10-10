public class Dungeon{
    Room guardian = new Room("Guardian Room:", " This is the room where you train to be a Guardian.");
    Room mage = new Room("Mage Room:", " This room is the room where you train to be a Mage!");
    Room druid = new Room("Druid Room:"," This room is the room where you train to be a Druid!");
    Room knight= new Room("Knight Room:"," This room is the room where you train to be a Knight!");
    Room base = new Room("Base Room:"," This is the room that everyone starts off at and is the weakest room.");
    Room assasin= new Room("Assasin Room: ","This room is the room where you train to be a Assasin!");
    Room archer= new Room("Knight Room:"," This room is the room where you train to be a Archer!");

    public Dungeon(){
        this.guardian = guardian;
        this.mage = mage;
        this.druid = druid;
        this.knight = knight;
        this.base = base;
        this.assasin = assasin;
        this.archer = archer;
        guardian.setExits(knight,null,null,mage);
        mage.setExits(base,null,guardian,druid);
        druid.setExits(assasin,null,mage,null);
        knight.setExits(null,guardian,null,base);
        base.setExits(archer,mage,knight,assasin);
        assasin.setExits(null,druid,base,null);
        archer.setExits(null,base,null,null);

    }
    public Room getStartRoom(){
        return base;
    }
}