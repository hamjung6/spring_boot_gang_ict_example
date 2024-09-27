package edu.ict.ex.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.ict.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class UserMapperTest {

   @Autowired
   private UserMapper userMapper;

   @Test
   void testUserMapper() {
      assertNotNull(userMapper);
   }

   @Test
   void testGetUser() {
      UserVO user = userMapper.getUser("admin");
      assertNotNull(user);

      System.out.println(user);

   }

   // 단방향(MD5, SHA 등) : 암호화(encoding)는 가능해도 복보화(decoding)는 안 되는 것
   // 양방향(AES, RSA, DES 등) : 암호화 및 복호화가 가능한 것

   @Autowired
   private PasswordEncoder passwordEncoder;
   
//   @Disabled
   @Test
   void testInsertUser() {

      UserVO user = new UserVO();
      user.setUsername("user2");
      user.setPassword(passwordEncoder.encode("user2"));
      user.setEnabled("1");

      userMapper.insertUser(user);
      userMapper.insertAuthorities(user);

      assertNotNull(user);

      System.out.println(user);
   }

   @Test
   void testMatcher() {

      UserVO user = userMapper.getUser("admin2");
      // $2a$10$sAseHf9twiHZZkgm0HsWuutwUymCreWR2DOWUh3qHbf4rngU5X4P6
      boolean isMatch = passwordEncoder.matches("admin2", user.getPassword());

      System.out.println(user.getPassword()); 
      assertEquals(isMatch, true);
   }
}