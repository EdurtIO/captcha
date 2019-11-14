/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.edurt.captcha.generate;

import com.edurt.captcha.model.CaptchaResultEntity;
import com.edurt.captcha.utils.CaptchaUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 生成验证码 <br/>
 * 描述 : 生成验证码 <br/>
 * 作者 : qianmoQ <br/>
 * 版本 : 1.0 <br/>
 * 创建时间 : 2018-01-15 14:19:03 <br/>
 * 联系作者 : <a href="mailTo:shichengoooo@163.com">qianmoQ</a>
 */
public class CalculateGenerate {

    private static int DEFAULT_WIDTH = 200;//图片宽度
    private static int DEFAULT_HEIGHT = 40;//图片高度

    /**
     * 生成验证码
     * 描述 : 生成验证码 <br/>
     *
     * @return 生成验证码返回实体类
     */
    public static CaptchaResultEntity generate() {
        BufferedImage image = new BufferedImage(DEFAULT_WIDTH, DEFAULT_HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics(); // 创建一个图形类
        graphics.setColor(CaptchaUtils.getBackgroundColor());// 背景颜色要偏淡
        graphics.fillRect(0, 0, DEFAULT_WIDTH, DEFAULT_HEIGHT);// 画背景
        graphics.setColor(CaptchaUtils.getBackgroundColor());// 边框颜色
//    graphics.drawRect(0, 0, DEFAULT_WIDTH - 1, DEFAULT_HEIGHT - 1);// 画边框
        CaptchaResultEntity captchaResultEntity = CaptchaUtils.generateCalculateImage();
        String[] result = captchaResultEntity.getExpression();
        int length = result.length;//生成验证码的数量
        Font font = new Font("YaHei", Font.ITALIC, 20);// 创建字体，字体的大小应该根据图片的高度来定。
        graphics.setFont(font);//设置字体
        for (int i = 0; i < length; i++) {
            String string = String.valueOf(result[i]);
            graphics.drawString(string, 30 * i + 30, 25);
        }
        graphics.dispose();// 图像生效
        captchaResultEntity.setImage(image);
        return captchaResultEntity;
    }

}
