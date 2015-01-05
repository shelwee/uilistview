uilistview
==========

uilistview基于[android-uitableview](https://github.com/thiagolocatelli/android-uitableview)扩展。

![](https://github.com/shelwee/ImageStorage/raw/master/UiListView/uilistview-demo1.png)

![](https://github.com/shelwee/ImageStorage/raw/master/UiListView/uilistview-demo2.png)

###用法
参照demo [UiListView-demo](https://github.com/shelwee/uilistview/tree/master/UiListView-demo)

这个项目是基于android-uitableview的扩展，使其更加灵活。只需在用法中增加属性如：
```xml
<com.shelwee.uilistview.ui.UiListView
		        android:id="@+id/uilist3"
		        android:layout_width="match_parent"
		        android:layout_height="wrap_content"
		        android:layout_below="@id/uilist2"
		        android:layout_marginTop="5dp"
		        apps:alignCenter="true"
		        apps:showChevron="false"
		        apps:singleItem="true"
		        apps:textBold="false"/>
```

1. alignCenter:文字介绍是否居中显示
2. showChevron: 是否显示右箭头
3. singleItem:　是否每条单独显示，可参照图片
4. textBold: 文字是否加粗显示

###License
>Copyright 2014 ShelWee(http://www.shelwee.com)

>Licensed under the Apache License, Version 2.0 (the "License");
>you may not use this file except in compliance with the License.
>You may obtain a copy of the License at

>    http://www.apache.org/licenses/LICENSE-2.0

>Unless required by applicable law or agreed to in writing, software
>distributed under the License is distributed on an "AS IS" BASIS,
>WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
>See the License for the specific language governing permissions and
>limitations under the License.
