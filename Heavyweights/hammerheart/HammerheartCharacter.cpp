// HammerheartCharacter.cpp
#include "HammerheartCharacter.h"

AHammerheartCharacter::AHammerheartCharacter()
{
    PrimaryActorTick.bCanEverTick = true;
    Stamina = 100.0f;
    bIsInvulnerable = false;
}

void AHammerheartCharacter::BeginPlay()
{
    Super::BeginPlay();
}

void AHammerheartCharacter::Tick(float DeltaTime)
{
    Super::Tick(DeltaTime);
}

void AHammerheartCharacter::UseHammerStrike()
{
    // Logic for double armor-breaking hammer strikes
}

void AHammerheartCharacter::ActivateDreadnought()
{
    bIsInvulnerable = true;
    // Set a timer to reset invulnerability after 3 seconds
}

void AHammerheartCharacter::UseBlastHammer()
{
    // Emit shockwaves that slow and disorient
}

void AHammerheartCharacter::ExecuteUltimate()
{
    // Check if enemy has <= 15% health
    // If yes, execute. If not, deal heavy damage.
}
