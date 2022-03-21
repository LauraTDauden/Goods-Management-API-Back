package com.bb2.goodsmanagement;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.service.ItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ItemServiceUnitTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords(){
        List<Item> items = itemService.itemList();
        //Assert.assertEquals(items.size(), 2);
    }


}
