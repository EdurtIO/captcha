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
package com.edurt.captcha;

import com.edurt.captcha.generate.CalculateGenerate;
import com.edurt.captcha.model.CaptchaResultEntity;
import com.edurt.captcha.utils.CaptchaUtils;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

/**
 * 项目测试类 <br/>
 * 描述 : 测试项目中各个数据模块 <br/>
 * 作者 : qianmoQ <br/>
 * 版本 : 1.0 <br/>
 * 创建时间 : 2018-01-15 14:21:55 <br/>
 * 联系作者 : <a href="mailTo:shichengoooo@163.com">qianmoQ</a>
 */
public class CalculateTest {

    @Test
    public void testCalculateEnum() {
        CaptchaResultEntity captchaResultEntity = CalculateGenerate.generate();
        Assert.assertNotNull(captchaResultEntity.getExpression());
        Assert.assertNotNull(captchaResultEntity.getResult());
    }

    @Test
    public void testDivide() {
        for (int i = 0; i < 1000; i++) {
            CaptchaUtils captchaUtil = new CaptchaUtils();
            captchaUtil.generateCalculateImage();
        }
    }

    @Test
    public void testGenerateImage() {
        JFrame jFrame = new JFrame();
        CaptchaResultEntity captchaResultEntity = CalculateGenerate.generate();
        jFrame.setBounds(400, 400, 250, 250);
        ImageIcon img = new ImageIcon(captchaResultEntity.getImage());
        System.out.println(captchaResultEntity.toString());
        JLabel background = new JLabel(img);
        jFrame.add(background);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
