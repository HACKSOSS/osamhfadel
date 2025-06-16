<p align="center">
  <img src="https://raw.githubusercontent.com/[YOUR_USERNAME]/osamhplayer/main/media/logo.png" width="200"/>
</p>

<h1 align="center">🎬 Osamh Player</h1>

<p align="center">
  <b>مشغّل فيديو متقدّم مصمم بعناية للمطورين العصريين باستخدام Flutter.</b><br/>
  <i>بُني على BetterPlayer، مع تحسينات جوهرية ودعم خصائص احترافية.</i>
</p>

<p align="center">
  <a href="https://pub.dev/packages/osamhplayer"><img src="https://img.shields.io/pub/v/osamhplayer.svg"></a>
  <a href="https://github.com/HACKSOSS/osamhfadel/blob/main/packages/osamh_player/LICENSE"><img src="https://img.shields.io/github/license/HACKSOSS/osamhplayer.svg?style=flat"></a>
  <a href="#"><img src="https://img.shields.io/badge/platform-flutter-blue.svg"></a>
</p>

---

## ✨ نظرة عامة

`osamh_player` هو مشغل فيديو شامل يدعم الميزات المتقدمة مثل الترجمة، التشغيل التكيّفي (HLS, DASH)، تشغيل القوائم، والدمج السلس مع واجهات Flutter.  
تم تصميمه ليكون **قابل للتخصيص، قوي الأداء، وسهل الاستخدام**.

<table>
  <tr>
    <td><img width="250px" src="https://github.com/HACKSOSS/osamhfadel/blob/main/packages/osamh_player/media/1.png"/></td>
    <td><img width="250px" src="https://github.com/HACKSOSS/osamhfadel/blob/main/packages/osamh_player/media/2.png"/></td>
    <td><img width="250px" src="https://github.com/HACKSOSS/osamhfadel/blob/main/packages/osamh_player/media/3.png"/></td>
  </tr>
</table>

---

## 🚀 المميزات

- ✅ دعم تشغيل الفيديوهات من الشبكة أو الملفات
- ✅ دعم **HLS** و **DASH** و **DRM** (مثل Widevine و FairPlay)
- ✅ دعم الترجمة (SRT, WebVTT) مع إمكانية التخصيص
- ✅ إمكانية تشغيل الفيديوهات داخل ListView / GridView بسلاسة
- ✅ دعم القوائم (Playlists)
- ✅ تحكم كامل في الواجهة (Play/Pause, Seek, Speed, Fullscreen)
- ✅ أداء محسّن على Android و iOS

---

## 🛠️ الاستخدام الأساسي

```dart
import 'package:osamh_player/osamh_player.dart';

final controller = OsamhPlayerController.network(
  'https://your-video-url.m3u8',
);

OsamhPlayer(controller: controller);
