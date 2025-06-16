مشغل أوسام المتقدم - Osamh Player
<p align="center"> <img src="https://raw.githubusercontent.com/HACKSOSS/osamhplayer/main/media/logo.png" width="200"/> <br/> <b>مشغل الوسائط الأكثر تطوراً وتخصيصاً في عالم Flutter</b> </p>
🚀 نظرة عامة
مشغل أوسام (Osamh Player) هو حل متكامل لتشغيل الفيديوهات بجودة احترافية، مصمم خصيصاً لتلبية احتياجات المطورين والمستخدمين النهائيين الذين يبحثون عن تجربة مشاهدة استثنائية. بُني هذا المشغل على أساسيات قوية مع إضافات مبتكرة تجعله الأفضل في فئته.

✨ المميزات الفريدة
تشغيل متعدد المصادر: يدعم تشغيل الفيديوهات من الشبكة، الملفات المحلية، وحتى التخزين السحابي

دعم الصيغ الحديثة: تشغيل سلس لتنسيقات HLS، DASH مع دعم كامل لتقنيات DRM مثل Widevine و FairPlay

واجهة قابلة للتخصيص بالكامل: تحكم كامل في كل عنصر من عناصر الواجهة

أداء محسن: تشغيل سلس حتى على الأجهزة محدودة الموارد

دعم متعدد اللغات: ترجمات مدمجة مع دعم لتنسيقات SRT و WebVTT

📱 منصات مدعومة
Android (من الإصدار 5.0 فما فوق)

iOS (من الإصدار 11.0 فما فوق)

Web (بدعم محدود لبعض الميزات)

Windows و Linux و macOS (في الطريق)

💻 أمثلة الاستخدام
التشغيل الأساسي
dart
import 'package:osamh_player/osamh_player.dart';

final playerController = OsamhPlayerController.network(
  'https://example.com/video.m3u8',
  videoQuality: VideoQuality.ultraHD,
  autoPlay: true,
);

@override
Widget build(BuildContext context) {
  return Scaffold(
    body: Center(
      child: OsamhPlayer(controller: playerController),
    ),
  );
}
التشغيل المتقدم مع القوائم
dart
final playlistController = OsamhPlaylistController(
  playlist: [
    OsamhVideoItem.network('https://example.com/video1.mp4'),
    OsamhVideoItem.network('https://example.com/video2.m3u8'),
    OsamhVideoItem.file('/path/to/local/video.mp4'),
  ],
  loopPlaylist: true,
);

OsamhPlaylistPlayer(controller: playlistController);
📞 تواصل مع المطور
نرحب بملاحظاتكم واستفساراتكم! يمكنكم التواصل معي عبر:

البريد الإلكتروني: osamh.dev@example.com

الهاتف: +967 717348644 (اليمن)

تويتر: @OsamhDev

GitHub: HACKSOSS

🌟 لماذا اخترت مشغل أوسام؟
أداء لا مثيل له: محسن ليعمل بسلاسة حتى مع دقة 4K

أمان عالي: دعم لتقنيات حماية المحتوى المتقدمة

تحديثات مستمرة: فريق دعم فني متواجد دائماً لتلبية احتياجاتك

مجتمع نشط: انضم إلى آلاف المطورين الذين يثقون بمشغل أوسام

📜 الترخيص
هذا المشروع مرخص تحت شروط رخصة MIT.

<p align="center"> <b>جرب تجربة المشغل المختلف الذي سيغير مفهومك لتشغيل الفيديو!</b> <br/><br/> <img src="https://raw.githubusercontent.com/HACKSOSS/osamhplayer/main/media/screenshot1.png" width="300"/> <img src="https://raw.githubusercontent.com/HACKSOSS/osamhplayer/main/media/screenshot2.png" width="300"/> </p>
