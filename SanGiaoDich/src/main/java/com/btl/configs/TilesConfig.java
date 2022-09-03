/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

/**
 *
 * @author Lọt
 */
@Configuration
public class TilesConfig {

    @Bean
    public UrlBasedViewResolver urlBasedViewResolver() {
        UrlBasedViewResolver resolve = new UrlBasedViewResolver();
        resolve.setViewClass(TilesView.class);
        resolve.setOrder(-2);
        return resolve;
    }
    
    @Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tile = new TilesConfigurer();
        tile.setDefinitions("WEB-INF/tiles.xml");
        tile.setCheckRefresh(true);
        
        return tile;
    }
}
