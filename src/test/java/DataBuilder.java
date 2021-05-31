import com.x.shop.entity.Address;
import com.x.shop.entity.User;
import com.x.shop.service.UserService;
import com.x.shop.service.UserServiceImpl;
import com.x.utils.UUIDUtils;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class DataBuilder {
    UserService userService = new UserServiceImpl();
    @Test
    public void CreateUser() {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            User user = new User(UUIDUtils.getUUID(), randomString(3), randomString(7) + "@" + randomString(3) + ".com",
                    randomString(8), (random.nextInt() & Integer.MAX_VALUE) % 3);
            userService.insert(user);
        }
    }

    @Test
    public void CreateAddress() {
        List<User> list = userService.getAllUser();

        for (int i = 0; i < 5; i++) {
            int userIndex = randomInteger(list.size());
            User user = list.get(userIndex);
            userService.insertAddress(new Address(UUIDUtils.getUUID(), list.get(userIndex).getUid(),
                    randomString(4, "asdfg"), randomString(4, "asdfg"),
                    user.getEmail(), "198" + randomString(8, "1234567890"),
                    "China", "Street " + randomString(4),
                    "Nanjing", randomString(5, "1234567890"),
                    "Jiangsu"));
        }
    }

    public static Integer randomInteger(int high) {
        Random random = new Random();
        return random.nextInt() & Integer.MAX_VALUE & high;
    }


    public static String randomString(int length) {
        return randomString(length,"1234567890qwertyuiopasdfghjklzxcvbnmABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    public static String randomString(int length, String alphabet) {

    // create a string of all characters

    // create random string builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    // specify length of random string

    for(int i = 0; i < length; i++) {

      // generate random index number
      int index = random.nextInt(alphabet.length());

      // get character specified by index
      // from the string
      char randomChar = alphabet.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }

    String randomString = sb.toString();
    return randomString;

  }
}
