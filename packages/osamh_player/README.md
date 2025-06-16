<!-- Header Section -->
<div align="center">
  <img src="https://github.com/HACKSOSS/osamhfadel/blob/main/packages/osamh_player/media/osamh.jpg" width="200" style="border-radius:50%;box-shadow:0 10px 20px rgba(0,0,0,0.2);"/>
  <h1 style="font-size:2.5rem;margin:20px 0;color:#4a6bff;text-shadow:2px 2px 4px rgba(0,0,0,0.1);">🎬 Osamh Player Pro</h1>
  <p style="font-size:1.2rem;max-width:800px;margin:0 auto;">
    <b>ثورة في عالم مشغلات الفيديو بتقنيات الذكاء الاصطناعي</b><br/>
    <span style="color:#ff6b6b;font-style:italic;">"من الترميز إلى التميز، من البكسل إلى الكمال"</span>
  </p>
  <img src="https://github.com/HACKSOSS/osamhfadel/blob/main/packages/osamh_player/media/٢٠٢٤٠٩٢٦_٢١٥١١٣.jpg" width="600" style="border-radius:15px;margin:20px 0;box-shadow:0 5px 15px rgba(0,0,0,0.1);"/>
</div>

<!-- Badges -->
<div align="center" style="margin:25px 0;">
  <img src="https://img.shields.io/badge/Flutter-3.19+-02569B?logo=flutter&style=for-the-badge" alt="Flutter"/>
  <img src="https://img.shields.io/badge/Platform-Android|iOS|Web-34a853?style=for-the-badge" alt="Multi-Platform"/>
  <img src="https://img.shields.io/github/stars/HACKSOSS/osamhplayer?color=ffd700&logo=github&style=for-the-badge" alt="Stars"/>
  <img src="https://img.shields.io/pub/v/osamh_player?color=blue&logo=dart&style=for-the-badge" alt="Pub Version"/>
</div>

---

<!-- Features Section -->
## ✨ الميزات الرائدة

<div style="display:grid;grid-template-columns:repeat(auto-fit, minmax(300px, 1fr));gap:20px;margin:30px 0;">

### 🚀 الأداء الخارق
- تشغيل 8K بسلاسة
- تقليل استهلاك البطارية 40%
- ذاكرة مخبأ ذكية

### 🧠 تقنيات الذكاء الاصطناعي
- تحسين الجودة التلقائي
- توليد ترجمات ذكي
- توصيات محتوى مخصصة

### 🔒 الحماية المتقدمة
- دعم Widevine/FairPlay
- تشفير AES-256
- حماية من التسجيل

</div>

---

<!-- Demo Section -->
## 🎥 معرض التطبيق

<div align="center">
  <table>
    <tr>
      <td><img src="https://raw.githubusercontent.com/HACKSOSS/osamhplayer/main/media/1.png" width="300" style="border-radius:10px;"/></td>
      <td><img src="https://raw.githubusercontent.com/HACKSOSS/osamhplayer/main/media/2.png" width="300" style="border-radius:10px;"/></td>
      <td><img src="https://raw.githubusercontent.com/HACKSOSS/osamhplayer/main/media/3.png" width="300" style="border-radius:10px;"/></td>
    </tr>
    <tr align="center">
      <td>واجهة ذكية</td>
      <td>تحكم دقيق</td>
      <td>إعدادات متقدمة</td>
    </tr>
  </table>
</div>

---

<!-- Quick Start -->
## ⚡ البدء السريع

```dart
import 'package:osamh_player/osamh_player.dart';

final controller = OsamhPlayerController.network(
  'https://example.com/video.m3u8',
  aiEnhancement: true,
);

@override
Widget build(BuildContext context) {
  return Scaffold(
    body: OsamhPlayer(controller: controller),
  );
}
