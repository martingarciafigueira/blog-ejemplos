package io.github.picodotdev.blogbitix.multidatabase.service;

import org.joda.time.DateTime;
import org.jooq.DSLContext;

import io.github.picodotdev.blogbitix.multidatabase.jooq.inventory.tables.records.ItemRecord;
import io.github.picodotdev.blogbitix.multidatabase.jooq.purchases.Tables;
import io.github.picodotdev.blogbitix.multidatabase.jooq.purchases.tables.records.PurchaseRecord;

public class PurchasesServiceImpl implements PurchasesService {

    private DSLContext context;
    private InventoryService inventory;

    public PurchasesServiceImpl(DSLContext context, InventoryService inventory) {
        this.context = context;
        this.inventory = inventory;
    }

    @Override
    public Long count() {
        return context.selectCount().from(Tables.PURCHASE).fetchOne(0, Long.class);
    }
    
    @Override
    public PurchaseRecord create(ItemRecord item, long quantity) throws NoStockException {
        inventory.changeStock(item, -quantity);

        PurchaseRecord record = context.newRecord(Tables.PURCHASE);
        record.setCreationdate(new DateTime());
        record.setQuantity(quantity);
        record.setPrice(item.getPrice());
        record.setItemId(item.getId());
        record.insert();        
        return record;
    }
}