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
package com.wikift.captcha.model;

import java.awt.image.BufferedImage;
import java.util.Arrays;

/**
 * 验证码结果 <br/>
 * 描述 : 验证码结果(计算的验证码的公式,计算的结果) <br/>
 * 作者 : qianmoQ <br/>
 * 版本 : 1.0 <br/>
 * 创建时间 : 2018-01-15 14:12:14 <br/>
 * 联系作者 : <a href="mailTo:shichengoooo@163.com">qianmoQ</a>
 */
public class CaptchaResultEntity {

    private String[] expression;//计算的公式
    private int result;//计算的结果
    private BufferedImage image;//图片对象

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String[] getExpression() {
        return expression;
    }

    public void setExpression(String[] expression) {
        this.expression = expression;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CaptchaResultEntity{" +
                "expression=" + Arrays.toString(expression) +
                ", result=" + result +
                ", image=" + image +
                '}';
    }

}