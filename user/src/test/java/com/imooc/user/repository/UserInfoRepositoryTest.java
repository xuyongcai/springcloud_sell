package com.imooc.user.repository;

import com.imooc.user.dataobject.UserInfo;
import com.imooc.user.enums.RoleEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoRepositoryTest {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void findByOpenid() {
        UserInfo userInfo = userInfoRepository.findByOpenid("abc");
        Assert.assertNotNull(userInfo);
        Assert.assertTrue(userInfo.getRole()== RoleEnum.BUYER.getCode());
    }

    @Test
    public void findByUsername() {
        UserInfo userInfo = userInfoRepository.findByUsername("admin");
        Assert.assertTrue(userInfo!=null);
        Assert.assertTrue(userInfo.getRole()== RoleEnum.BUYER.getCode());
    }
}