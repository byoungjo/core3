package infPrj.core.dip;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class PayServiceTest {
    private PayService service = new PayService();

    @Test
    @DisplayName("Ss 테스트")
    void SsTest() {
        Pay ssPat = new SsPay();
        service.setPay(ssPat);
        assertThat(service.payment()).isEqualTo("SsPay");
    }

    @Test
    @DisplayName("Ka 테스트")
    void KaTest(){
        Pay ssPat = new KaPay();
        service.setPay(ssPat);
        assertThat(service.payment()).isEqualTo("KaPay");
    }
}