package logbook.internal.gui;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import logbook.Messages;
import logbook.bean.Ship;
import logbook.bean.ShipLabelCollection;
import logbook.bean.ShipMst;
import logbook.bean.SlotItem;
import logbook.bean.SlotItemCollection;
import logbook.bean.SlotitemMst;
import logbook.bean.Stype;
import logbook.internal.Items;
import logbook.internal.SeaArea;
import logbook.internal.Ships;

/**
 * 所有艦娘
 *
 */
public class ShipItem {

    /** ID */
    private IntegerProperty id;

    /** 艦娘 */
    private ObjectProperty<Ship> ship;

    /** 艦種 */
    private StringProperty type;

    /** Lv */
    private IntegerProperty lv;

    /** 経験値 */
    private IntegerProperty exp;
    
    /** Next */
    private IntegerProperty next;

    /** cond */
    private IntegerProperty cond;

    /** ラベル */
    private ObjectProperty<Set<String>> label;

    /** 制空 */
    private IntegerProperty seiku;

    /** 砲戦火力 */
    private IntegerProperty hPower;

    /** 雷戦火力 */
    private IntegerProperty rPower;

    /** 夜戦火力 */
    private IntegerProperty yPower;

    /** 対潜火力 */
    private IntegerProperty tPower;

    /** 火力 */
    private IntegerProperty karyoku;
    
    /** 雷装 */
    private IntegerProperty raisou;
    
    /** 対空 */
    private IntegerProperty taiku;
    
    /** 装甲 */
    private IntegerProperty soukou;
    
    /** 回避 */
    private IntegerProperty kaihi;
    
    /** 対潜(素) */
    private IntegerProperty tais;

    /** 索敵 */
    private IntegerProperty sakuteki;
    
    /** 運 */
    private IntegerProperty lucky;

    /** 装備1 */
    private IntegerProperty slot1;

    /** 装備2 */
    private IntegerProperty slot2;

    /** 装備3 */
    private IntegerProperty slot3;

    /** 装備4 */
    private IntegerProperty slot4;

    /** 補強 */
    private IntegerProperty slotEx;

    /**
     * IDを取得します。
     * @return ID
     */
    public IntegerProperty idProperty() {
        return this.id;
    }

    /**
     * IDを取得します。
     * @return ID
     */
    public int getId() {
        return this.id.get();
    }

    /**
     * IDを設定します。
     * @param id ID
     */
    public void setId(int id) {
        this.id = new SimpleIntegerProperty(id);
    }

    /**
     * 艦娘を取得します。
     * @return 艦娘
     */
    public ObjectProperty<Ship> shipProperty() {
        return this.ship;
    }

    /**
     * 艦娘を取得します。
     * @return 艦娘
     */
    public Ship getShip() {
        return this.ship.get();
    }

    /**
     * 艦娘を設定します。
     * @param ship 艦娘
     */
    public void setShip(Ship ship) {
        this.ship = new SimpleObjectProperty<>(ship);
    }

    /**
     * 艦種を取得します。
     * @return 艦種
     */
    public StringProperty typeProperty() {
        return this.type;
    }

    /**
     * 艦種を取得します。
     * @return 艦種
     */
    public String getType() {
        return this.type.get();
    }

    /**
     * 艦種を設定します。
     * @param type 艦種
     */
    public void setType(String type) {
        this.type = new SimpleStringProperty(type);
    }

    /**
     * Lvを取得します。
     * @return Lv
     */
    public IntegerProperty lvProperty() {
        return this.lv;
    }

    /**
     * Lvを取得します。
     * @return Lv
     */
    public int getLv() {
        return this.lv.get();
    }

    /**
     * Lvを設定します。
     * @param lv Lv
     */
    public void setLv(int lv) {
        this.lv = new SimpleIntegerProperty(lv);
    }

    /**
     * Expを取得します。
     * @return Exp
     */
    public IntegerProperty expProperty() {
        return this.exp;
    }

    /**
     * Expを取得します。
     * @return Exp
     */
    public int getExp() {
        return this.exp.get();
    }

    /**
     * Expを設定します。
     * @param exp Exp
     */
    public void setExp(int exp) {
        this.exp = new SimpleIntegerProperty(exp);
    }
    
    /**
     * Nextを取得します。
     * @return Next
     */
    public IntegerProperty nextProperty() {
        return this.next;
    }

    /**
     * Nextを取得します。
     * @return Next
     */
    public int getNext() {
        return this.next.get();
    }

    /**
     * Nextを設定します。
     * @param next Next
     */
    public void setNext(int next) {
        this.next = new SimpleIntegerProperty(next);
    }

    /**
     * condを取得します。
     * @return cond
     */
    public IntegerProperty condProperty() {
        return this.cond;
    }

    /**
     * condを取得します。
     * @return cond
     */
    public int getCond() {
        return this.cond.get();
    }

    /**
     * condを設定します。
     * @param cond cond
     */
    public void setCond(int cond) {
        this.cond = new SimpleIntegerProperty(cond);
    }

    /**
     * ラベルを取得します。
     * @return ラベル
     */
    public ObjectProperty<Set<String>> labelProperty() {
        return this.label;
    }

    /**
     * ラベルを取得します。
     * @return ラベル
     */
    public Set<String> getLabel() {
        return this.label.get();
    }

    /**
     * ラベルを設定します。
     * @param area ラベル
     */
    public void setLabel(Set<String> label) {
        this.label = new SimpleObjectProperty<>(label);
    }

    /**
     * 制空を取得します。
     * @return 制空
     */
    public IntegerProperty seikuProperty() {
        return this.seiku;
    }

    /**
     * 制空を取得します。
     * @return 制空
     */
    public int getSeiku() {
        return this.seiku.get();
    }

    /**
     * 制空を設定します。
     * @param seiku 制空
     */
    public void setSeiku(int seiku) {
        this.seiku = new SimpleIntegerProperty(seiku);
    }

    /**
     * 砲戦火力を取得します。
     * @return 砲戦火力
     */
    public IntegerProperty hPowerProperty() {
        return this.hPower;
    }

    /**
     * 砲戦火力を取得します。
     * @return 砲戦火力
     */
    public int gethPower() {
        return this.hPower.get();
    }

    /**
     * 砲戦火力を設定します。
     * @param hPower 砲戦火力
     */
    public void sethPower(int hPower) {
        this.hPower = new SimpleIntegerProperty(hPower);
    }

    /**
     * 雷戦火力を取得します。
     * @return 雷戦火力
     */
    public IntegerProperty rPowerProperty() {
        return this.rPower;
    }

    /**
     * 雷戦火力を取得します。
     * @return 雷戦火力
     */
    public int getrPower() {
        return this.rPower.get();
    }

    /**
     * 雷戦火力を設定します。
     * @param rPower 雷戦火力
     */
    public void setrPower(int rPower) {
        this.rPower = new SimpleIntegerProperty(rPower);
    }

    /**
     * 夜戦火力を取得します。
     * @return 夜戦火力
     */
    public IntegerProperty yPowerProperty() {
        return this.yPower;
    }

    /**
     * 夜戦火力を取得します。
     * @return 夜戦火力
     */
    public int getyPower() {
        return this.yPower.get();
    }

    /**
     * 夜戦火力を設定します。
     * @param yPower 夜戦火力
     */
    public void setyPower(int yPower) {
        this.yPower = new SimpleIntegerProperty(yPower);
    }

    /**
     * 対潜火力を取得します。
     * @return 対潜火力
     */
    public IntegerProperty tPowerProperty() {
        return this.tPower;
    }

    /**
     * 対潜火力を取得します。
     * @return 対潜火力
     */
    public int gettPower() {
        return this.tPower.get();
    }

    /**
     * 対潜火力を設定します。
     * @param tPower 対潜火力
     */
    public void settPower(int tPower) {
        this.tPower = new SimpleIntegerProperty(tPower);
    }

    /**
     * 火力(素)を取得します。
     * @return 火力(素)
     */
    public IntegerProperty karyokuProperty() {
        return this.karyoku;
    }

    /**
     * 火力(素)を取得します。
     * @return 火力(素)
     */
    public int getKaryoku() {
        return this.karyoku.get();
    }

    /**
     * 火力(素)を設定します。
     * @param karyoku 火力(素)
     */
    public void setKaryoku(int karyoku) {
        this.karyoku = new SimpleIntegerProperty(karyoku);
    }
    
    /**
     * 雷装(素)を取得します。
     * @return 雷装(素)
     */
    public IntegerProperty raisouProperty() {
        return this.raisou;
    }

    /**
     * 雷装(素)を取得します。
     * @return 雷装(素)
     */
    public int getRaisou() {
        return this.raisou.get();
    }

    /**
     * 雷装(素)を設定します。
     * @param raisou 雷装(素)
     */
    public void setRaisou(int raisou) {
        this.raisou = new SimpleIntegerProperty(raisou);
    }

    /**
     * 対空(素)を取得します。
     * @return 対空(素)
     */
    public IntegerProperty taikuProperty() {
        return this.taiku;
    }

    /**
     * 対空(素)を取得します。
     * @return 対空(素)
     */
    public int getTaiku() {
        return this.taiku.get();
    }

    /**
     * 対空(素)を設定します。
     * @param taiku 対空(素)
     */
    public void setTaiku(int taiku) {
        this.taiku = new SimpleIntegerProperty(taiku);
    }

    /**
     * 装甲(素)を取得します。
     * @return 装甲(素)
     */
    public IntegerProperty soukouProperty() {
        return this.soukou;
    }

    /**
     * 装甲(素)を取得します。
     * @return 装甲(素)
     */
    public int getSoukou() {
        return this.soukou.get();
    }

    /**
     * 装甲(素)を設定します。
     * @param soukou 装甲(素)
     */
    public void setSoukou(int soukou) {
        this.soukou = new SimpleIntegerProperty(soukou);
    }

    /**
     * 回避(素)を取得します。
     * @return 回避(素)
     */
    public IntegerProperty kaihiProperty() {
        return this.kaihi;
    }

    /**
     * 回避(素)を取得します。
     * @return 回避(素)
     */
    public int getKaihi() {
        return this.kaihi.get();
    }

    /**
     * 回避(素)を設定します。
     * @param kaihi 回避(素)
     */
    public void setKaihi(int kaihi) {
        this.kaihi = new SimpleIntegerProperty(kaihi);
    }

    /**
     * 対潜(素)を取得します。
     * @return 対潜(素)
     */
    public IntegerProperty taisProperty() {
        return this.tais;
    }

    /**
     * 対潜(素)を取得します。
     * @return 対潜(素)
     */
    public int getTais() {
        return this.tais.get();
    }

    /**
     * 対潜(素)を設定します。
     * @param tPower 対潜(素)
     */
    public void setTais(int tais) {
        this.tais = new SimpleIntegerProperty(tais);
    }

    /**
     * 索敵(素)を取得します。
     * @return 索敵(素)
     */
    public IntegerProperty sakutekiProperty() {
        return this.sakuteki;
    }

    /**
     * 索敵(素)を取得します。
     * @return 索敵(素)
     */
    public int getSakuteki() {
        return this.sakuteki.get();
    }

    /**
     * 索敵(素)を設定します。
     * @param sakuteki 索敵(素)
     */
    public void setSakuteki(int sakuteki) {
        this.sakuteki = new SimpleIntegerProperty(sakuteki);
    }

    /**
     * 運(素)を取得します。
     * @return 運(素)
     */
    public IntegerProperty luckyProperty() {
        return this.lucky;
    }

    /**
     * 運(素)を取得します。
     * @return 運(素)
     */
    public int getLucky() {
        return this.lucky.get();
    }

    /**
     * 運(素)を設定します。
     * @param lucky 運(素)
     */
    public void setLucky(int luckey) {
        this.lucky = new SimpleIntegerProperty(luckey);
    }

    /**
     * 装備1を取得します。
     * @return 装備1
     */
    public IntegerProperty slot1Property() {
        return this.slot1;
    }

    /**
     * 装備1を取得します。
     * @return 装備1
     */
    public int getSlot1() {
        return this.slot1.get();
    }

    /**
     * 装備1を設定します。
     * @param slot1 装備1
     */
    public void setSlot1(int slot1) {
        this.slot1 = new SimpleIntegerProperty(slot1);
    }

    /**
     * 装備2を取得します。
     * @return 装備2
     */
    public IntegerProperty slot2Property() {
        return this.slot2;
    }

    /**
     * 装備2を取得します。
     * @return 装備2
     */
    public int getSlot2() {
        return this.slot2.get();
    }

    /**
     * 装備2を設定します。
     * @param slot2 装備2
     */
    public void setSlot2(int slot2) {
        this.slot2 = new SimpleIntegerProperty(slot2);
    }

    /**
     * 装備3を取得します。
     * @return 装備3
     */
    public IntegerProperty slot3Property() {
        return this.slot3;
    }

    /**
     * 装備3を取得します。
     * @return 装備3
     */
    public int getSlot3() {
        return this.slot3.get();
    }

    /**
     * 装備3を設定します。
     * @param slot3 装備3
     */
    public void setSlot3(int slot3) {
        this.slot3 = new SimpleIntegerProperty(slot3);
    }

    /**
     * 装備4を取得します。
     * @return 装備4
     */
    public IntegerProperty slot4Property() {
        return this.slot4;
    }

    /**
     * 装備4を取得します。
     * @return 装備4
     */
    public int getSlot4() {
        return this.slot4.get();
    }

    /**
     * 装備4を設定します。
     * @param slot4 装備4
     */
    public void setSlot4(int slot4) {
        this.slot4 = new SimpleIntegerProperty(slot4);
    }

    /**
     * 補強を取得します。
     * @return 補強
     */
    public IntegerProperty slotExProperty() {
        return this.slotEx;
    }

    /**
     * 補強を取得します。
     * @return 補強
     */
    public int getSlotEx() {
        return this.slotEx.get();
    }

    /**
     * 補強を設定します。
     * @param slotEx 補強
     */
    public void setSlotEx(int slotEx) {
        this.slotEx = new SimpleIntegerProperty(slotEx);
    }

    @Override
    public String toString() {
        Map<Integer, SlotItem> itemMap = SlotItemCollection.get()
                .getSlotitemMap();

        // 装備の名前
        Function<Integer, String> slotItemName = itemId -> {
            SlotItem item = itemMap.get(itemId);
            return Items.slotitemMst(item)
                    .map(mst -> {

                        StringBuilder text = new StringBuilder(mst.getName());

                        text.append(Optional.ofNullable(item.getAlv())
                                .map(alv -> Messages.getString("item.alv", alv)) //$NON-NLS-1$
                                .orElse(""));
                        text.append(Optional.ofNullable(item.getLevel())
                                .filter(lv -> lv > 0)
                                .map(lv -> Messages.getString("item.level", lv)) //$NON-NLS-1$
                                .orElse(""));
                        return text.toString();
                    }).orElse("");
        };

        return new StringJoiner("\t")
                .add(Integer.toString(this.id.get()))
                .add(Optional.ofNullable(this.ship.get())
                        .map(s -> Ships.shipMst(s).map(ShipMst::getName).orElse(""))
                        .orElse(""))
                .add(this.type.get())
                .add(Integer.toString(this.lv.get()))
                .add(Integer.toString(this.exp.get()))
                .add(Integer.toString(this.next.get()))
                .add(Integer.toString(this.cond.get()))
                .add(this.label.get().stream().collect(Collectors.joining(",")))
                .add(Integer.toString(this.seiku.get()))
                .add(Integer.toString(this.hPower.get()))
                .add(Integer.toString(this.rPower.get()))
                .add(Integer.toString(this.yPower.get()))
                .add(Integer.toString(this.tPower.get()))
                .add(Integer.toString(this.karyoku.get()))
                .add(Integer.toString(this.raisou.get()))
                .add(Integer.toString(this.taiku.get()))
                .add(Integer.toString(this.soukou.get()))
                .add(Integer.toString(this.kaihi.get()))
                .add(Integer.toString(this.tais.get()))
                .add(Integer.toString(this.sakuteki.get()))
                .add(Integer.toString(this.lucky.get()))
                .add(slotItemName.apply(this.slot1.get()))
                .add(slotItemName.apply(this.slot2.get()))
                .add(slotItemName.apply(this.slot3.get()))
                .add(slotItemName.apply(this.slot4.get()))
                .add(slotItemName.apply(this.slotEx.get()))
                .toString();
    }

    /**
     * 艦娘から所有艦娘を生成します
     *
     * @param ship 艦娘
     * @return 所有艦娘
     */
    public static ShipItem toShipItem(Ship ship) {
        String type = Ships.stype(ship)
                .map(Stype::getName)
                .orElse("");
        ShipItem shipItem = new ShipItem();
        shipItem.setId(ship.getId());
        shipItem.setShip(ship);
        shipItem.setType(type);
        shipItem.setLv(ship.getLv());
        shipItem.setExp(ship.getExp().get(0));
        shipItem.setNext(ship.getExp().get(1));
        shipItem.setCond(ship.getCond());
        Set<String> label = new LinkedHashSet<>();
        SeaArea area = SeaArea.fromArea(ship.getSallyArea());
        if (area != null) {
            label.add(area.toString());
        }
        Set<String> shipLabels = ShipLabelCollection.get()
                .getLabels()
                .get(ship.getId());
        if (shipLabels != null) {
            label.addAll(shipLabels);
        }

        shipItem.setLabel(FXCollections.observableSet(label));
        shipItem.setSeiku(Ships.airSuperiority(ship));
        shipItem.sethPower(Ships.hPower(ship));
        shipItem.setrPower(Ships.rPower(ship));
        shipItem.setyPower(Ships.yPower(ship));
        shipItem.settPower(Ships.tPower(ship));

        shipItem.setKaryoku(ship.getKaryoku().get(0) - sumItemParam(ship, i -> i.getHoug()));
        shipItem.setRaisou(ship.getRaisou().get(0) - sumItemParam(ship, i -> i.getRaig()));
        shipItem.setTaiku(ship.getTaiku().get(0) - sumItemParam(ship, i -> i.getTyku()));
        shipItem.setSoukou(ship.getSoukou().get(0) - sumItemParam(ship, i -> i.getSouk()));
        shipItem.setKaihi(ship.getKaihi().get(0) - sumItemParam(ship, i -> i.getHouk()));
        shipItem.setTais(ship.getTaisen().get(0) - sumItemParam(ship, i -> i.getTais()));
        shipItem.setSakuteki(ship.getSakuteki().get(0) - sumItemParam(ship, i -> i.getSaku()));
        shipItem.setLucky(ship.getLucky().get(0) - sumItemParam(ship, i -> i.getLuck()));

        int slotNum = ship.getSlotnum();
        shipItem.setSlot1(ship.getSlot().get(0) == -1 && slotNum <= 0 ? 0 : ship.getSlot().get(0));
        shipItem.setSlot2(ship.getSlot().get(1) == -1 && slotNum <= 1 ? 0 : ship.getSlot().get(1));
        shipItem.setSlot3(ship.getSlot().get(2) == -1 && slotNum <= 2 ? 0 : ship.getSlot().get(2));
        shipItem.setSlot4(ship.getSlot().get(3) == -1 && slotNum <= 3 ? 0 : ship.getSlot().get(3));
        shipItem.setSlotEx(ship.getSlotEx());

        return shipItem;
    }
    
    /**
     * 装備のパラメータを合計する
     * @param ship 艦娘
     * @param mapper 合計するパラメータを返す mapper
     * @return
     */
    private static int sumItemParam(Ship ship, Function<? super SlotitemMst, Integer> mapper) {
        Map<Integer, SlotItem> items = SlotItemCollection.get().getSlotitemMap();
        return Stream.concat(ship.getSlot().stream(), Stream.of(ship.getSlotEx()))
        .map(items::get)
        .map(Items::slotitemMst)
        .mapToInt(e -> e.map(mapper).orElse(0))
        .sum();
    }
}
