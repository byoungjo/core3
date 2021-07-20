package infPrj.core.dip;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class PayServiceTest {
    private PayService payService = new PayService();

    @Test
    @DisplayName("Ss 테스트")
    void SsTest() {
        Pay ssPat = new SsPay();
        payService.setPay(ssPat);
        assertThat(payService.payment()).isEqualTo("SsPay");
    }

    @Test
    @DisplayName("Ka 테스트")
    void KaTest(){
        Pay ssPat = new KaPay();
        payService.setPay(ssPat);
        assertThat(payService.payment()).isEqualTo("KaPay");
    }
}