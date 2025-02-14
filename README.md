# Toplu Taşıma Planlayıcı

Bu proje java yazılım dili kullanılarak hazırlanmıştır, farklı mahalleler arasında en uygun toplu taşıma güzergahını belirlemek için bir karar destek sistemidir. Softmax fonksiyonunu kullanarak mahallelerin ağırlıklarını hesaplar ve en uygun mahalleyi belirler.

## Giriş

Bu proje, toplu taşıma güzergahlarının daha verimli ve çevre dostu bir şekilde belirlenmesini amaçlamaktadır. Aşağıdaki kriterler dikkate alınarak mahalleler arasında en uygun bölge seçilecektir:

- **Nüfus Yoğunluğu**: %30 etki
- **Ulaşım Altyapısı**: %20 etki
- **Maliyet**: %10 etki (ters orantılı)
- **Çevresel Etki**: %15 etki
- **Sosyal Fayda**: %25 etki

## Nasıl Çalışır?

Program, belirlenen mahalleler hakkında yukarıdaki kriterleri değerlendirerek her bir mahalleye bir ağırlık değeri atar. Bu veriler, softmax fonksiyonu ile normalize edilir ve en uygun güzergah belirlenir.

## Kullanılan Yöntemler

Softmax fonksiyonu, her bir kriterin ağırlığını hesaplarken kullanılır. Ağırlıklar daha sonra normalize edilir ve her mahalle için toplam skor hesaplanır.

## Ödevi Hazırlayan

Recep Efe Eren 1230505035
