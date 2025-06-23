import 'package:flutter_test/flutter_test.dart';
import 'package:osamh_encryptor/osamh_encryptor.dart';
import 'package:osamh_encryptor/osamh_encryptor_method_channel.dart';
import 'package:osamh_encryptor/osamh_encryptor_platform_interface.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

class MockNativeEncryptorPlatform
    with MockPlatformInterfaceMixin
    implements NativeEncryptorPlatform {

  @override
  Future<String?> getPlatformVersion() => Future.value('42');

  @override
  Future<String?> decrypt({required String passPhrase, required String concatenatedCipherText}) {
    // TODO: implement decrypt
    throw UnimplementedError();
  }

  @override
  Future<String?> encrypt({required String passPhrase, required String contentToEncrypt}) {
    // TODO: implement encrypt
    throw UnimplementedError();
  }
}

void main() {
  final NativeEncryptorPlatform initialPlatform = NativeEncryptorPlatform.instance;

  test('$MethodChannelNativeEncryptor is the default instance', () {
    expect(initialPlatform, isInstanceOf<MethodChannelNativeEncryptor>());
  });

  test('getPlatformVersion', () async {
    Osamh_Encryptor nativeEncryptorPlugin = Osamh_Encryptor();
    MockNativeEncryptorPlatform fakePlatform = MockNativeEncryptorPlatform();
    NativeEncryptorPlatform.instance = fakePlatform;

    expect(await nativeEncryptorPlugin.getPlatformVersion(), '42');
  });
}
