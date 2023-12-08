public interface RPGAccessory{
    void equip();      //ติดตั้งอุปกรณ์
    void unequip();    //ถอดอุปกรณ์
    void information(int n); // รายละเอียดของอุปกรณ์
    void drop();        // ทิ้งอุปกรณ์
}

interface Head extends RPGAccessory{
    void increaseCriticalRate();  //เพิ่มอัตราการติด Critical
}

interface Body extends RPGAccessory{
    void increasesArmorAndHP();   // เพิ่มเลือดและเกาะแบบเบิ้มๆ
}

interface Gauntlets extends RPGAccessory{
    void attackSpeed();        //ตีไวตีว่อง
}

interface Boots extends RPGAccessory{
    void runSpeed();         //เพิ่มความเร็วในการวิ่ง
}

interface Rings extends RPGAccessory{
    void vampire();        //ดูดเลือด
}



