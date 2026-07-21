package com.wxfwill.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {
    /**
     * 验证最小启动入口可执行，开始业务练习后应替换为真实场景测试。
     */
    @Test
    void shouldStartWithoutError() {
        assertDoesNotThrow(() -> App.main(new String[0]));
    }
}
