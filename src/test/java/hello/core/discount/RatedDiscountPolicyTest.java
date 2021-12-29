package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RatedDiscountPolicyTest {

    RatedDiscountPolicy discountPolicy = new RatedDiscountPolicy();

    @Test
    @DisplayName("VIPs get 10% discounts.")
    void vip_discount() {
        Member member = new Member(1L, "pikachu", Grade.VIP);
        int price = 10000;
        int discountedPrice = discountPolicy.discount(member, price);
        Assertions.assertThat(discountedPrice).isEqualTo(1000);
    }

    @Test
    @DisplayName("Regular member get no discounts.")
    void regular_discount() {
        Member member = new Member(1L, "raichu", Grade.BASIC);
        int price = 10000;
        int discountedPrice = discountPolicy.discount(member, price);
        Assertions.assertThat(discountedPrice).isEqualTo(0);
    }
}
