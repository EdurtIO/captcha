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
package com.edurt.captcha.model;

/**
 * 验证码实体类 <br/>
 * 描述 : 验证码实体类 <br/>
 * 作者 : qianmoQ <br/>
 * 版本 : 1.0 <br/>
 * 创建时间 : 2018-01-15 14:11:05 <br/>
 * 联系作者 : <a href="mailTo:shichengoooo@163.com">qianmoQ</a>
 */
public class CaptchaEntity {

    private int firstNumber = 0;// 第一个计算数:输出的数据
    private int lastNumber = 0;// 第二个计算数:输出的数据
    private int calc = 0;// 计算方式: 0 加法, 1 减法, 2 乘法, 3 除法, 4 等于
    private int number = 0;// 取数据的类型,0 阿拉伯数字 | 1 中文大写汉字

    public CaptchaEntity() {
    }

    public CaptchaEntity(int firstNumber, int lastNumber, int calc, int number) {
        super();
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
        this.calc = calc;
        this.number = number;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(int lastNumber) {
        this.lastNumber = lastNumber;
    }

    public int getCalc() {
        return calc;
    }

    public void setCalc(int calc) {
        this.calc = calc;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "firstNumber = " + firstNumber + " ,lastNumber = " + lastNumber + " ,calc = " + calc + " ,number = " + number;
    }

}
