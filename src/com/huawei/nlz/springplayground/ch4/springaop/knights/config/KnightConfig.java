package com.huawei.nlz.springplayground.ch4.springaop.knights.config;

import com.huawei.nlz.springplayground.ch4.springaop.knights.BraveKnight;
import com.huawei.nlz.springplayground.ch4.springaop.knights.Knight;
import com.huawei.nlz.springplayground.ch4.springaop.knights.Quest;
import com.huawei.nlz.springplayground.ch4.springaop.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
